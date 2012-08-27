package org.eclipse.vjet.dsf.common.enums;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.eclipse.vjet.dsf.logger.LogLevel;
import org.eclipse.vjet.dsf.logger.Logger;
import org.eclipse.vjet.dsf.util.JdkUtil;



/**
 * EnumManager maintains the chain of Enum instances of same type. Its primitive
 * hashmap facilitates the quick look up of any Enum instances.
 * <p>
 * It provides ListIterator for orderly traversing the collection.
 * <p>
 * It also provides a set of convenience methods for BaseEnum to use.
 * <p>
 * This helper class is only used by BaseEnum at same package.
 * <p>
 * It statically maintains all the instances of itself. A set of static methods
 * allows BaseEnum to easily retrive and store all Enum instances of different
 * types. All instance methods are private and used internally
 */
public class EnumManager {
	private static final int DEFAULT_MAP_SIZE = 19;
	private BaseEnum m_firstEnum = null;
	private BaseEnum m_lastEnum = null;
	private final Map<Integer, BaseEnum> m_map;
	private static final ConcurrentMap<Class, EnumManager> s_managers = new ConcurrentHashMap<Class, EnumManager>();
	private static volatile Logger s_logger = null;

	private static Logger getLogger() {
		if (s_logger == null) {
			s_logger = Logger.getInstance(EnumManager.class);
		}
		return s_logger;
	}

	/**
	 * Construct an EnumManager with the default initial map size.
	 */
	private EnumManager() {
		m_map = new HashMap<Integer, BaseEnum>(DEFAULT_MAP_SIZE);
	}

	/**
	 * Add an Enum into the proper collection, it will also set up the proper
	 * ordered links between the newly add Enum with others.
	 * 
	 * @param enum
	 *            an Enum object to be added into the collection.
	 */
	static void add(BaseEnum enumX) {
		getManager(enumX.getClass()).addToManager(enumX);
	}

	/**
	 * Return an Enum object base on its type and id.
	 * 
	 * @param type
	 *            a Class type for the Enum.
	 * @param id
	 *            an int id of the Enum.
	 * 
	 * @return BaseEnum - an Enum instance, null if not found.
	 */
	static BaseEnum getEnum(Class type, int id) {
		return getManager(type).get(type, id);
	}

	/**
	 * Answer the first Enum for this type that has the same name as the arg. If
	 * no match return null. Since there is no guarantee that the name is
	 * unique, the first match if any is returned.
	 * 
	 * @param type
	 * @param name
	 * @return
	 */
	static BaseEnum getEnum(Class type, String name) {
		return getManager(type).get(type, name);
	}

	/**
	 * Answer the first Enum for this type that has the same name (ignoring
	 * case) as the arg. If no match return null. Since there is no guarantee
	 * that the name is unique, the first match if any is returned.
	 * 
	 * @param type
	 * @param name
	 * @return
	 */
	static BaseEnum getEnumIgnoreCase(Class type, String name) {
		return getManager(type).getIgnoreCase(type, name);
	}

	static BaseEnum getEnum(Class type, Integer id) {
		if (id == null) {
			return null;
		}
		return getEnum(type, id.intValue());
	}

	/**
	 * Return an Enum object base on its type and id. If not exists, return the
	 * passed-in default object.
	 * 
	 * @param type
	 *            a Class type for the Enum.
	 * @param id
	 *            an int id of the Enum.
	 * @param defaultEnum
	 *            a fall-back Enum object.
	 * 
	 * @return BaseEnum - an Enum instance, null if not found.
	 */
	static BaseEnum getElseEnum(Class type, int id, BaseEnum defaultEnum) {
		return getManager(type).getElseReturn(type, id, defaultEnum);
	}

	/**
	 * Return a ListIterator for a given Enum class type based on the definition
	 * order of all the constants.
	 * 
	 * @param type
	 *            a Class type for the Enum.
	 * 
	 * @return ListIterator - an iterator for all constants defined by this Enum
	 *         class.
	 */
	static ListIterator getIterator(Class type) {
		return getManager(type).iterator();
	}

	/**
	 * Return a List for a given Enum class type based on the definition order
	 * of all the constants. The List may be modified and will not affect the
	 * contents of the Enum.
	 * 
	 * @param type
	 *            a Class type for the Enum.
	 * 
	 * @return List - an List for all constants defined by this Enum class.
	 */
	static List getList(Class type) {
		return getManager(type).getList();
	}

	/**
	 * Create an array of constants of given class type including all the
	 * constants from its enclosing derived classes. This operation is only
	 * applicable to the Enum types where the root class can't be extended
	 * outside the class (only derivable through inner class) while all derived
	 * inner class types are final.
	 * 
	 * @param clz
	 *            a root Class type.
	 * @param enclosingClzz
	 *            an array of enclosing classes.
	 * 
	 * @return Object - an array of Enum constants.
	 */
	static Object createEnclosedEnumArray(Class clz, Class[] enclosingClzz) {
		if (!BaseEnum.class.isAssignableFrom(clz)) {
			throw new IllegalArgumentException("createEnclosingEnumArray: "
					+ clz + " is not the right type");
		}
		Constructor[] constructors = clz.getDeclaredConstructors();
		for (int i = 0; i < constructors.length; i++) {
			// The root class can't be extended besides its inner class
			int modifier = constructors[i].getModifiers();
			if (Modifier.isPublic(modifier) || Modifier.isProtected(modifier)) {
				throw new IllegalArgumentException("createEnclosingEnumArray: "
						+ constructors[i] + " is not private");
			}
		}
		for (int i = 0; i < enclosingClzz.length; i++) {
			// All inner classes have to be final and extended from the
			// enclosing class.
			Class childClz = enclosingClzz[i];
			if (!clz.isAssignableFrom(childClz)) {
				throw new IllegalArgumentException("createEnclosingEnumArray: "
						+ childClz + " is not derived from " + clz);
			}
			if (!Modifier.isFinal(childClz.getModifiers())) {
				throw new IllegalArgumentException("createEnclosingEnumArray: "
						+ childClz + " is not final");
			}
		}
		EnumManager theManager = getManager(clz);
		List allEnums = new ArrayList();
		populateForward(theManager, allEnums);
		for (int i = 0; i < enclosingClzz.length; i++) {
			EnumManager manager = getManager(enclosingClzz[i]);
			populateForward(manager, allEnums);
		}
		Object allEnclosingEnums = null;
		int size = allEnums.size();
		if (size > 0) {
			allEnclosingEnums = Array.newInstance(clz, size);
			for (int i = 0; i < size; i++) {
				Array.set(allEnclosingEnums, i, allEnums.get(i));
			}
		}
		return allEnclosingEnums;
	}

	/**
	 * Create an array of constants of given parent class type including all the
	 * constants from this class and inherited ones up to the top class.
	 * 
	 * @param clz
	 *            a Class type.
	 * @param topClz
	 *            a top parent Class type.
	 * 
	 * @return Object - an array of Enum constants.
	 */
	static Object createInheritedEnumArray(Class clz, Class topClz) {
		if (!BaseEnum.class.isAssignableFrom(topClz)) {
			throw new IllegalArgumentException("createInheriedEnumArray: "
					+ topClz + " is not the right type");
		}
		if (!topClz.isAssignableFrom(clz)) {
			throw new IllegalArgumentException("createInheriedEnumArray: "
					+ topClz + " is not the base type for " + clz);
		}
		EnumManager theManager = getManager(clz);
		List allEnums = new ArrayList();
		while (theManager != null) {
			populateBackward(theManager, allEnums);
			if (clz == topClz) {
				break;
			}
			clz = clz.getSuperclass();
			theManager = getManager(clz);
		}
		Object allInheritedEnums = null;
		int size = allEnums.size();
		if (size > 0) {
			allInheritedEnums = Array.newInstance(topClz, size);
			for (int i = 0; i < size; i++) {
				Array.set(allInheritedEnums, i, allEnums.get(i));
			}
		}
		return allInheritedEnums;
	}

	/**
	 * Return the size of the constants collection.
	 * 
	 * @param clz
	 *            a Class type.
	 * 
	 * @return int - number of constants in the collection.
	 */
	static final int size(Class type) {
		return getManager(type).size();
	}

	/**
	 * Add an BaseEnum to the manager.
	 */
	private void addToManager(BaseEnum theEnum) {
		// Can't pass a null here
		if (theEnum == null) {
			throw new IllegalArgumentException(
					"add(BaseEnum) entry must not be null");
		}

		// Every value must be unique
		int id = theEnum.getId();
		if (m_map.containsKey(id)) {
			throw new IllegalArgumentException("BaseEnum with value: " + id
					+ " already exists");
		}

		// The next pointer should always be null
		if (theEnum.m_nextEnum != null) {
			throw new IllegalArgumentException(
					"add(BaseEnum) must have entry.next == null");
		}

		// The previous pointer should always be null
		if (theEnum.m_previousEnum != null) {
			throw new IllegalArgumentException(
					"add(BaseEnum) must have entry.prev == null");
		}

		// Save the first one
		if (m_firstEnum == null) {
			m_firstEnum = theEnum;
		} else {
			// set the linkage
			theEnum.m_previousEnum = m_lastEnum;
			m_lastEnum.m_nextEnum = theEnum;
		}

		// remember the last one we've seen
		m_lastEnum = theEnum;
		// add entry to map
		m_map.put(id, theEnum);
	}

	/**
	 * Get the Enum corresponding to a value.
	 */
	private final BaseEnum get(Class type, int id) {
		BaseEnum result = m_map.get(id);
		if (result == null) {
			// static initialization may not be complete; wait until the static
			// initialization is complete and try again
			loadClass(type);
			result = m_map.get(id);
			if (result == null) {
				// TODO: we log this???
				logDebug(id);
			}
		}
		return result;
	}

	/**
	 * Answer the Enum that has the same name as the passed in arg. If no
	 * matches, returns null.
	 * 
	 * @param name
	 * @return
	 */
	private final BaseEnum get(Class type, String name) {
		if (name == null) {
			return null;
		}

		BaseEnum enumX = doGet(name);
		if (enumX == null) {
			// static initialization may not be complete; wait until the static
			// initialization is complete and try again
			loadClass(type);
			enumX = doGet(name);
		}
		return enumX;
	}

	private BaseEnum doGet(String name) {
		BaseEnum enumX = first();

		while (enumX != null) {
			if (enumX.getName().equals(name)) {
				return enumX;
			}
			enumX = enumX.next();
		}

		return null;
	}

	private final BaseEnum getIgnoreCase(Class type, String matchName) {
		if (matchName == null) {
			return null;
		}
		BaseEnum enumX = doGetIgnoreCase(matchName);
		if (enumX == null) {
			// static initialization may not be complete; wait until the static
			// initialization is complete and try again
			loadClass(type);
			enumX = doGetIgnoreCase(matchName);
		}
		return enumX;
	}

	private BaseEnum doGetIgnoreCase(String matchName) {
		BaseEnum enumX = first();

		while (enumX != null) {
			String enumName = enumX.getName();
			// Be paranoid of null names since we don't prevent construction
			// of Enums with a null name.
			if (matchName.equalsIgnoreCase(enumName)) {
				return enumX;
			}
			enumX = enumX.next();
		}

		return null;
	}

	/**
	 * Get the Enum corresponding to a value, supplying a default.
	 */
	private final BaseEnum getElseReturn(Class type, int id, BaseEnum elseEnum) {
		BaseEnum result = m_map.get(id);
		if (result == null) {
			// static initialization may not be complete; wait until the static
			// initialization is complete and try again
			loadClass(type);
			result = m_map.get(id);
			if (result == null) {
				logDebug(id);
			}
		}
		return (result == null) ? elseEnum : result;
	}

	public void logDebug(int id) {
		if (!getLogger().isDebugEnabled()) {
			return;
		}
		Class type = null;
		if (m_firstEnum != null) {
			type = m_firstEnum.getClass();
		}
		StringBuilder msg = new StringBuilder();
		msg.append("enum alert!!!");
		if (type != null) {
			msg.append(" type=" + type.getName());
		}
		msg.append(" key=" + id);
		msg.append(" intMapSize" + m_map.size() + "\n");
		msg.append("KeySet = " + m_map.keySet());
		// msg.append(m_map.getInternalInfo(id));
		// for test
		// System.out.println(msg.toString());
		getLogger().log(LogLevel.DEBUG, msg.toString());
	}

	/**
	 * Returns an List based on the defined order of the Enum. This order is
	 * based on the order of the definition in the actual Enum implementation
	 * class. The List may be modified and will not affect the contents of the
	 * Enum.
	 */
	private final List getList() {
		List answer = new ArrayList(size());
		BaseEnum enumX = first();
		while (enumX != null) {
			answer.add(enumX);
			enumX = enumX.next();
		}
		return answer;
	}

	/**
	 * Returns an ListIterator based on the defined order of the Enum. This
	 * order is based on the order of the definition in the actual Enum
	 * implementation class.
	 */
	private final ListIterator iterator() {
		// See ListIterator javadoc for definitions
		return new ListIterator() {
			BaseEnum cur = null; // last elem returned by next() or previous()
			BaseEnum next = first(); // next element returned by next()
			int ix = 0; // nextIndex()

			public boolean hasNext() {
				return next != null;
			}

			public Object next() {
				if (next == null) {
					throw new NoSuchElementException("no next element");
				}
				cur = next;
				next = next.next();
				ix++;
				return cur;
			}

			public boolean hasPrevious() {
				return (cur != null) ? (cur.previous() != null) : false;
			}

			public Object previous() {
				if ((cur == null) || (cur.previous() == null)) {
					throw new NoSuchElementException("no previous element");
				}
				ix--;
				next = cur;
				cur = cur.previous();
				return cur;
			}

			public int nextIndex() {
				return ix;
			}

			public int previousIndex() {
				return ((ix - 2) < 0) ? (-1) : (ix - 2);
			}

			public void remove() {
				throw new UnsupportedOperationException("remove");
			}

			public void set(Object o) {
				throw new UnsupportedOperationException("set");
			}

			public void add(Object o) {
				throw new UnsupportedOperationException("add");
			}
		};
	}

	/**
	 * Return the number of Enums that have been added.
	 */
	private final int size() {
		return m_map.size();
	}

	/**
	 * Return the first Enum added or null.
	 */
	private final BaseEnum first() {
		return m_firstEnum;
	}

	/**
	 * Return the last Enum added or null.
	 */
	private final BaseEnum last() {
		return m_lastEnum;
	}

	/**
	 * Return an array of all the ids used by this Enum type.
	 */

	// private final int[] values() {
	// return m_map.keys();
	// }
	/**
	 * Return an EnumManager for a given Enum Class.
	 */
	private static EnumManager getManager(Class type) {
		EnumManager aManager = s_managers.get(type);
		if (aManager == null) {
			aManager = new EnumManager();
			EnumManager oldManager = s_managers.putIfAbsent(type, aManager);
			if (oldManager != null) {
				aManager = oldManager;
			}
			// We may have added the manager without starting the static
			// initialization of the class; the manager should be made available
			// to the thread only after the static initialization is complete
			// (unless the thread is already in static initialization); thus
			// we should force static initialization at least in the case the
			// manager was just added.
			// It is still possible to see the cached manager before the static
			// initialization is complete if s_managers.get() returns the
			// non-null object. Those cases are addressed by having the callers
			// retry after waiting until static initialization is complete.
			loadClass(type);
		}
		return aManager;
	}

	private static void loadClass(Class cls) {
		JdkUtil.forceInit(cls); // KEEPME
	}

	/**
	 * Populate the list into an EnumManager in forward order.
	 */
	static private void populateForward(EnumManager manager, List list) {
		BaseEnum enumX = manager.first();
		while (enumX != null) {
			list.add(enumX);
			enumX = enumX.next();
		}
	}

	/**
	 * Populate the list into an EnumManager in backward order.
	 */
	static private void populateBackward(EnumManager manager, List list) {
		BaseEnum enumX = manager.last();
		while (enumX != null) {
			list.add(0, enumX);
			enumX = enumX.previous();
		}
	}
}
vjo.ctype('syntax.loseOperator.LoseOperator1')
.protos({
	m_name:undefined, //< private String

	//> private void setName(String name)
	setName: function (name) {
		this.m_name = name;
	},
	
		
	//> public void init1()
	init1 : function(){
		this.setName("HA");
	}
})
.endType();
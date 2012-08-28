/*******************************************************************************
 * Copyright (c) 2012 eBay Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     eBay Inc. - initial API and implementation
 *******************************************************************************/
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug5395")
.props({
	//> public void resize(String,int,int);
    resize : function(psId, piWidth, piHeight) {
        var d = document, e = d[psId]||d.images[psId], ow, oh, nw, nh, arw, arh, ar;
        if(e){
            //getting original width and height.
            ow = e.width;
            oh = e.height;
            //calcualting aspect ratio
            arw = ow/piWidth;
            arh = oh/piHeight;
            ar = (arw> arh) ? arw : arh;
            if(ar >= 1){
                nw = ow/ar;
                nh = oh/ar;
            }else{
                nw = ow;
                nh = oh;
            }
            e.width = nw;
            e.height = nh;
        }
    }   
})
.endType();
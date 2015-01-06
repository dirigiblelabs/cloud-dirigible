/******************************************************************************* 
 * Copyright (c) 2009 EclipseSource and others. All rights reserved. This
 * program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   EclipseSource - initial API and implementation
 *******************************************************************************/
package com.sap.dirigible.ide.ui.rap.layoutsets.fancy;

import org.eclipse.rap.ui.interactiondesign.layout.model.ILayoutSetInitializer;
import org.eclipse.rap.ui.interactiondesign.layout.model.LayoutSet;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;

import com.sap.dirigible.ide.ui.rap.shared.LayoutSetConstants;

public class CoolbarOverflowInitializer implements ILayoutSetInitializer {

	public void initializeLayoutSet(final LayoutSet layoutSet) {
		String path = LayoutSetConstants.IMAGE_PATH_FANCY;
		layoutSet.addImagePath(LayoutSetConstants.OVERFLOW_BG, path
				+ "toolbar_overflow_layer_bg.png"); //$NON-NLS-1$
		layoutSet.addImagePath(LayoutSetConstants.OVERFLOW_RIGHT, path
				+ "toolbar_overflow_layer_right.png"); //$NON-NLS-1$
		layoutSet.addImagePath(LayoutSetConstants.OVERFLOW_LEFT, path
				+ "toolbar_overflow_layer_left.png"); //$NON-NLS-1$
		layoutSet.addImagePath(LayoutSetConstants.OVERFLOW_WAVE, path
				+ "header_wave_layer.png"); //$NON-NLS-1$
		layoutSet.addImagePath(LayoutSetConstants.OVERFLOW_ARROW, path
				+ "toolbar_overflow_arrow.png"); //$NON-NLS-1$
		FormData fdItemTable = new FormData();
		fdItemTable.top = new FormAttachment(0, 5);
		fdItemTable.left = new FormAttachment(0, 0);
		fdItemTable.bottom = new FormAttachment(100);
		fdItemTable.right = new FormAttachment(100, -5);
		layoutSet.addPosition(LayoutSetConstants.OVERFLOW_POS, fdItemTable);
	}
}
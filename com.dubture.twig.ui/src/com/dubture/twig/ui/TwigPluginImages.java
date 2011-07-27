package com.dubture.twig.ui;

import java.net.URL;
import java.util.HashMap;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.osgi.framework.Bundle;

public class TwigPluginImages {
	
	public static final IPath ICONS_PATH = new Path("/ico/full"); //$NON-NLS-1$
	
	private static final String NAME_PREFIX = "com.dubture.twig.ui."; //$NON-NLS-1$
	private static final int NAME_PREFIX_LENGTH = NAME_PREFIX.length();
	
	// The plug-in registry
	private static ImageRegistry fgImageRegistry = null;
	
	private static HashMap<String, ImageDescriptor> fgAvoidSWTErrorMap = null;
	private static final String T_OBJ = "obj16"; //$NON-NLS-1$
	
	public static final String IMG_OBJS_TAG = NAME_PREFIX + "block-small-icon.gif";
	public static final String IMG_OBJS_FILTER = NAME_PREFIX + "filter-icon.gif"; 		
	public static final String IMG_OBJS_FUNCTION = NAME_PREFIX + "paren.gif";
	public static final String IMG_OBJS_TEST = NAME_PREFIX + "question-small-icon.gif";		
	
	
	public static final ImageDescriptor DESC_OBJS_TAG = createManagedFromKey(T_OBJ, IMG_OBJS_TAG);	
	public static final ImageDescriptor DESC_OBJS_FILTER = createManagedFromKey(T_OBJ, IMG_OBJS_FILTER);	
	public static final ImageDescriptor DESC_OBJS_FUNCTION = createManagedFromKey(T_OBJ, IMG_OBJS_FUNCTION);	
	public static final ImageDescriptor DESC_OBJS_TEST = createManagedFromKey(T_OBJ, IMG_OBJS_TEST);	
	
	
	
	
	
	private static ImageDescriptor createManagedFromKey(String prefix, String key) {
		return createManaged(prefix, key.substring(NAME_PREFIX_LENGTH), key);
	}

	private static ImageDescriptor createManaged(String prefix, String name,
			String key) {
		try {
			ImageDescriptor result = create(prefix, name, true);
			if (fgAvoidSWTErrorMap == null) {
				fgAvoidSWTErrorMap = new HashMap<String, ImageDescriptor>();
			}
			fgAvoidSWTErrorMap.put(key, result);
			if (fgImageRegistry != null) {
				// Plugin.logErrorMessage("Image registry already defined");
				// //$NON-NLS-1$

			}
			return result;
		} catch (Throwable ex) {
			ex.printStackTrace();
		}
		return null;
	}	
	
	/*
	 * Creates an image descriptor for the given prefix and name in the Symfony UI
	 * bundle. The path can contain variables like $NL$. If no image could be
	 * found, <code>useMissingImageDescriptor</code> decides if either the
	 * 'missing image descriptor' is returned or <code>null</code>. or <code>null</code>.
	 */
	private static ImageDescriptor create(String prefix, String name, boolean useMissingImageDescriptor) {
		IPath path = ICONS_PATH.append(prefix).append(name);
		
		
		return createImageDescriptor(TwigUICorePlugin.getDefault().getBundle(), path, useMissingImageDescriptor);
	}

	/*
	 * Creates an image descriptor for the given prefix and name in the Symfony UI
	 * bundle. The path can contain variables like $NL$. If no image could be
	 * found, the 'missing image descriptor' is returned.
	 */
	private static ImageDescriptor create(String prefix, String name) {
		return create(prefix, name, true);
	}	
	
	/*
	 * Creates an image descriptor for the given path in a bundle. The path can
	 * contain variables like $NL$. If no image could be found, <code>useMissingImageDescriptor</code>
	 * decides if either the 'missing image descriptor' is returned or <code>null</code>.
	 * Added for 3.1.1.
	 */
	public static ImageDescriptor createImageDescriptor(Bundle bundle, IPath path, boolean useMissingImageDescriptor) {
		URL url = FileLocator.find(bundle, path, null);
		if (url != null) {
			return ImageDescriptor.createFromURL(url);
		}
		if (useMissingImageDescriptor) {
			return ImageDescriptor.getMissingImageDescriptor();
		}
		return null;
	}		

}

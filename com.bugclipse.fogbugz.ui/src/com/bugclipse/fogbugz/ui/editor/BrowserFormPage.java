/*******************************************************************************
 * Copyright (c) 2004, 2007 Mylyn project committers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.bugclipse.fogbugz.ui.editor;

import org.eclipse.mylyn.tasks.core.AbstractTask;
import org.eclipse.mylyn.tasks.ui.editors.TaskEditorInput;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.ScrolledForm;

public class BrowserFormPage extends FormPage {

	public static final String ID_EDITOR = "com.bugclipse.fogbugz.ui.editor";

	private Browser browser;

	public BrowserFormPage(FormEditor editor, String title) {
		super(editor, ID_EDITOR, title);
	}

	@Override
	protected void createFormContent(IManagedForm managedForm) {
		super.createFormContent(managedForm);
		try {
			AbstractTask task = ((TaskEditorInput) getEditorInput()).getTask();
			ScrolledForm form = managedForm.getForm();
			form.getBody().setLayout(new FillLayout());
			browser = new Browser(form.getBody(), SWT.NONE);
			managedForm.getForm().setContent(browser);
			browser.setUrl(task.getUrl());
		} catch (SWTError e) {
			e.printStackTrace();
			//StatusHandler.fail(e, "Could not create Browser page: " + e.getMessage(), true);
		} catch (RuntimeException e) {
			e.printStackTrace();
			//StatusHandler.fail(e, "could not create issue report page", false);
		}
	}

	@Override
	public void dispose() {
		if (browser != null && !browser.isDisposed()) {
			browser.dispose();
		}
		super.dispose();
	}
}

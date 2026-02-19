/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved
 */
package br.com.vivopocbackoffice.widgets;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.Label;

import com.hybris.cockpitng.util.DefaultWidgetController;

import br.com.vivopocbackoffice.services.VivopocbackofficeService;


public class VivopocbackofficeController extends DefaultWidgetController
{
	private static final long serialVersionUID = 1L;
	private Label label;

	@WireVariable
	private transient VivopocbackofficeService vivopocbackofficeService;

	@Override
	public void initialize(final Component comp)
	{
		super.initialize(comp);
		label.setValue(vivopocbackofficeService.getHello() + " VivopocbackofficeController");
	}
}

/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package br.com.vivopocfacades.setup;

import static br.com.vivopocfacades.constants.VivopocfacadesConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import br.com.vivopocfacades.constants.VivopocfacadesConstants;
import br.com.vivopocfacades.service.VivopocfacadesService;


@SystemSetup(extension = VivopocfacadesConstants.EXTENSIONNAME)
public class VivopocfacadesSystemSetup
{
	private final VivopocfacadesService vivopocfacadesService;

	public VivopocfacadesSystemSetup(final VivopocfacadesService vivopocfacadesService)
	{
		this.vivopocfacadesService = vivopocfacadesService;
	}

	@SystemSetup(process = SystemSetup.Process.ALL, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		vivopocfacadesService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return VivopocfacadesSystemSetup.class.getResourceAsStream("/vivopocfacades/sap-hybris-platform.png");
	}
}

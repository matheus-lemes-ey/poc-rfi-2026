/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package br.com.vivopoccore.setup;

import static br.com.vivopoccore.constants.VivopoccoreConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import br.com.vivopoccore.constants.VivopoccoreConstants;
import br.com.vivopoccore.service.VivopoccoreService;


@SystemSetup(extension = VivopoccoreConstants.EXTENSIONNAME)
public class VivopoccoreSystemSetup
{
	private final VivopoccoreService vivopoccoreService;

	public VivopoccoreSystemSetup(final VivopoccoreService vivopoccoreService)
	{
		this.vivopoccoreService = vivopoccoreService;
	}

	@SystemSetup(process = SystemSetup.Process.ALL, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		vivopoccoreService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return VivopoccoreSystemSetup.class.getResourceAsStream("/vivopoccore/sap-hybris-platform.png");
	}
}

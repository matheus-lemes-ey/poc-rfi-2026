/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package br.com.poccore.setup;

import static br.com.poccore.constants.PoccoreConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import br.com.poccore.constants.PoccoreConstants;
import br.com.poccore.service.PoccoreService;


@SystemSetup(extension = PoccoreConstants.EXTENSIONNAME)
public class PoccoreSystemSetup
{
	private final PoccoreService poccoreService;

	public PoccoreSystemSetup(final PoccoreService poccoreService)
	{
		this.poccoreService = poccoreService;
	}

	@SystemSetup(process = SystemSetup.Process.ALL, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		poccoreService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return PoccoreSystemSetup.class.getResourceAsStream("/poccore/sap-hybris-platform.png");
	}
}

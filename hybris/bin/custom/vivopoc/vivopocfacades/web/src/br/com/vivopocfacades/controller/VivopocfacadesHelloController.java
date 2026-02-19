/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package br.com.vivopocfacades.controller;

import static br.com.vivopocfacades.constants.VivopocfacadesConstants.PLATFORM_LOGO_CODE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import br.com.vivopocfacades.service.VivopocfacadesService;


@Controller
public class VivopocfacadesHelloController
{
	@Autowired
	private VivopocfacadesService vivopocfacadesService;

	@GetMapping("/")
	public String printWelcome(final ModelMap model)
	{
		model.addAttribute("logoUrl", vivopocfacadesService.getHybrisLogoUrl(PLATFORM_LOGO_CODE));
		return "welcome";
	}
}

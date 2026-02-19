/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package br.com.vivopoccore.controller;

import static br.com.vivopoccore.constants.VivopoccoreConstants.PLATFORM_LOGO_CODE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import br.com.vivopoccore.service.VivopoccoreService;


@Controller
public class VivopoccoreHelloController
{
	@Autowired
	private VivopoccoreService vivopoccoreService;

	@GetMapping("/")
	public String printWelcome(final ModelMap model)
	{
		model.addAttribute("logoUrl", vivopoccoreService.getHybrisLogoUrl(PLATFORM_LOGO_CODE));
		return "welcome";
	}
}

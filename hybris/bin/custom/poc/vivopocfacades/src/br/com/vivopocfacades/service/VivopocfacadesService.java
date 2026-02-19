/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package br.com.vivopocfacades.service;

public interface VivopocfacadesService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}

package io.github.magishanpixel.mgnflowers.misc;

import io.github.magishanpixel.mgnflowers.platform.Services;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Constants {

	public static final String MOD_ID = "mgnflowers";
	public static final String MOD_NAME = "MGN's Flowers";
	public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

	public static final boolean isDevelopment = Services.PLATFORM.isDevelopmentEnvironment();
}
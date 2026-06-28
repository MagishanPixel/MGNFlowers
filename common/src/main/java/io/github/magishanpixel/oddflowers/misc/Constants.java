package io.github.magishanpixel.oddflowers.misc;

import io.github.magishanpixel.oddflowers.platform.Services;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Constants {

	public static final String MOD_ID = "oddflowers";
	public static final String MOD_NAME = "Odd Flowers";
	public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

	public static final boolean isDevelopment = Services.PLATFORM.isDevelopmentEnvironment();
}
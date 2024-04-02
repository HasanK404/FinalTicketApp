package com.airline.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ErrorLogger {

    private static final Logger logger = LoggerFactory.getLogger(ErrorLogger.class);

    public void logError(String errorMessage) {
        logger.error(errorMessage);
    }

    public void logError(String errorMessage, Throwable exception) {
        logger.error(errorMessage, exception);
    }
}

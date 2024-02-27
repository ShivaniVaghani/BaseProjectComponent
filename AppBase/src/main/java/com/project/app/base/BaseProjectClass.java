package com.project.app.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseProjectClass {

    protected Logger logger;

    public BaseProjectClass() {
        this.logger = LoggerFactory.getLogger(this.getClass());
    }
}

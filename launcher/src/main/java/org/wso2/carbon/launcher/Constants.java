/*
 *  Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.wso2.carbon.launcher;

import java.nio.file.Paths;

/**
 * Carbon constants.
 *
 * @since 5.0.0
 */
public class Constants {

    public static final String LAUNCH_PROPERTIES_FILE = "launch.properties";

    public static final String CARBON_HOME = "carbon.home";
    public static final String CARBON_START_TIME = "carbon.start.time";

    public static final String PROFILE = "profile";
    public static final String DEFAULT_PROFILE = "profiles/default";

    public static final String CARBON_OSGI_REPOSITORY = "carbon.osgi.repository";
    public static final String CARBON_OSGI_FRAMEWORK = "carbon.osgi.framework";
    public static final String CARBON_INITIAL_OSGI_BUNDLES = "carbon.initial.osgi.bundles";
    public static final String CARBON_SERVER_LISTENERS = "carbon.server.listeners";

    public static final String OSGI_INSTALL_AREA = "osgi.install.area";
    public static final String OSGI_CONFIG_AREA = "osgi.configuration.area";
    public static final String OSGI_INSTANCE_AREA = "osgi.instance.area";
    public static final String ECLIPSE_P2_DATA_AREA = "eclipse.p2.data.area";

    public static final String REPOSITORY_DIR_PATH = "repository";
    public static final String REPOSITORY_CONF_DIR_PATH = Paths.get(REPOSITORY_DIR_PATH, "conf").toString();
    public static final String LAUNCH_CONF_DIR_PATH = Paths.get(REPOSITORY_CONF_DIR_PATH, "osgi").toString();

    public static final String PAX_DEFAULT_SERVICE_LOG_LEVEL = "org.ops4j.pax.logging.DefaultServiceLog.level";

    //Constants relevant to log level.
    public static final String LOG_LEVEL_WARN = "WARN";

    /**
     * Prevent instantiating the Constants class.
     */
    private Constants() {
    }

    /**
     * Carbon server process exit codes.
     */
    public static class ExitCodes {
        public static final int SUCCESSFUL_TERMINATION = 0;
        public static final int UNSUCCESSFUL_TERMINATION = -1;
        public static final int RESTART_ACTION = 121;
    }
}

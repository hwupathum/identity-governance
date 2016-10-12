/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.identity.account.suspension.notification.task.util;

/**
 * Constants for account suspension notification module.
 */
public class NotificationConstants {

    public static final String SUSPENSION_NOTIFICATION_ENABLED = "suspension.notification.enable";
    public static final String SUSPENSION_NOTIFICATION_ACCOUNT_DISABLE_DELAY = "suspension.notification.account.disable.delay";
    public static final String SUSPENSION_NOTIFICATION_TRIGGER_TIME= "suspension.notification.trigger.time";
    public static final String SUSPENSION_NOTIFICATION_DELAYS="suspension.notification.delays";
    public static final String TRIGGER_TIME_FORMAT = "HH:mm:ss";
    public static final long SCHEDULER_DELAY = 24; // In hours
    public static final String SUSPENSION_NOTIFICATION_THREAD_POOL_SIZE = "suspension.notification.thread.pool.size";

}
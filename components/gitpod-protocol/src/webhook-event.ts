/**
 * Copyright (c) 2022 Gitpod GmbH. All rights reserved.
 * Licensed under the GNU Affero General Public License (AGPL).
 * See License-AGPL.txt in the project root for license information.
 */

export interface WebhookEvent {
    id: string;
    creationTime: string;
    type: "push" | string;

    authorizedUserId?: string;

    /**
     * webhook event's payload
     */
    rawEvent: string;

    status: WebhookEvent.Status;

    /**
     * Optional message to help understand errors with handling events.
     */
    message?: string;

    prebuildStatus?: WebhookEvent.PrebuildStatus;

    /**
     * if `status` is `prebuild_triggered` we can expect this to point to a triggered prebuild.
     */
    prebuildId?: string;

    projectId?: string;

    cloneUrl?: string;

    branch?: string;

    commit?: string;
}

export namespace WebhookEvent {
    export type Status = "received" | "dismissed_unauthorized" | "ignored" | "processed";
    export type PrebuildStatus = "ignored_unconfigured" | "prebuild_trigger_failed" | "prebuild_triggered";
}

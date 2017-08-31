/******************************************************************************
 *  Copyright (c) 2011 GitHub Inc.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *    Kevin Sawicki (GitHub Inc.) - initial API and implementation
 *****************************************************************************/
package org.eclipse.egit.github.core;

public class IssueTimelineEvent extends IssueEvent {
    /**
     * The issue was referenced from another issue.
     */
    public static final String TYPE_CROSS_REFERENCED = "cross-referenced"; //$NON-NLS-1$

    private EventSource source;

    public EventSource getSource() {
        return source;
    }

    public IssueTimelineEvent setSource(EventSource source) {
        this.source = source;
        return this;
    }
}

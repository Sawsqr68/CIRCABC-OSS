/*******************************************************************************
 * Copyright 2006 European Community
 *
 *  Licensed under the EUPL, Version 1.1 or - as soon they
 *  will be approved by the European Commission - subsequent
 *  versions of the EUPL (the "Licence");
 *  You may not use this work except in compliance with the
 *  Licence.
 *  You may obtain a copy of the Licence at:
 *
 *  https://joinup.ec.europa.eu/software/page/eupl
 *
 *  Unless required by applicable law or agreed to in
 *  writing, software distributed under the Licence is
 *  distributed on an "AS IS" basis,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 *  express or implied.
 *  See the Licence for the specific language governing
 *  permissions and limitations under the Licence.
 ******************************************************************************/
package eu.cec.digit.circabc.action.evaluator;

import eu.cec.digit.circabc.model.CircabcModel;
import eu.cec.digit.circabc.model.ModerationModel;
import eu.cec.digit.circabc.service.profile.permissions.LibraryPermissions;
import eu.cec.digit.circabc.service.profile.permissions.NewsGroupPermissions;
import org.alfresco.web.action.evaluator.BaseActionEvaluator;
import org.alfresco.web.bean.repository.Node;

/**
 * Evaluates whether the current user can remove an abuse the given node in the moderation process
 *
 * @author yanick pignot
 */
public class RemoveAbuseEvaluator extends BaseActionEvaluator {

    private static final long serialVersionUID = 6112283424092389996L;

    public boolean evaluate(final Node node) {
        if (node.hasAspect(ModerationModel.ASPECT_ABUSE_SIGNALED)) {
            if (node.hasAspect(CircabcModel.ASPECT_LIBRARY)) {
                return node.hasPermission(LibraryPermissions.LIBADMIN.toString());
            } else {
                return node.hasPermission(NewsGroupPermissions.NWSMODERATE.toString());
            }
        } else {
            return false;
        }
    }
}

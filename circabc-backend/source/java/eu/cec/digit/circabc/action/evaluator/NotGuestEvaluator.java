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

import eu.cec.digit.circabc.web.Beans;
import org.alfresco.web.action.evaluator.BaseActionEvaluator;
import org.alfresco.web.bean.repository.Node;

/**
 * We can't email a dossier if user is guest
 *
 * @author Slobodan Filipovic
 */
public class NotGuestEvaluator extends BaseActionEvaluator {

    private static final long serialVersionUID = 2164369999290163419L;

    public boolean evaluate(final Node node) {
        return !Beans.getWaiNavigator().getIsGuest();
    }

}

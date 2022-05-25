/*--+
 |     Copyright European Community 2006 - Licensed under the EUPL V.1.0
 |
 |          http://ec.europa.eu/idabc/en/document/6523
 |
 +--*/

package eu.cec.digit.circabc.migration.processor;

import eu.cec.digit.circabc.migration.entities.generated.ImportRoot;
import eu.cec.digit.circabc.migration.journal.MigrationTracer;
import eu.cec.digit.circabc.service.CircabcServiceRegistry;
import eu.cec.digit.circabc.service.migration.ImportationException;

/**
 * Base interface of post processor that is call after a migration process or a dry run.
 *
 * @author Yanick Pignot
 */
public interface PostProcessor
{
	/**
	 * Apply any validation, tranformation, ... on the object graph after a run or a dry run.
	 *
	 * @param importRoot
	 */
	public abstract void afterProcess(final CircabcServiceRegistry registry, final ImportRoot importRoot, final MigrationTracer importationJournal) throws ImportationException;


}
/**********************************************************************************
 * $URL$
 * $Id$
 ***********************************************************************************
 *
 * Copyright 2003, 2004, 2005, 2006 Sakai Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at
 *
 *       http://www.osedu.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 *
 **********************************************************************************/

package uk.ac.cam.caret.sakai.rwiki.service.api.dao;

import java.util.List;

import uk.ac.cam.caret.sakai.rwiki.service.api.model.RWikiCurrentObject;
import uk.ac.cam.caret.sakai.rwiki.service.api.model.RWikiHistoryObject;
import uk.ac.cam.caret.sakai.rwiki.service.api.model.RWikiObject;

// FIXME: Service

public interface RWikiHistoryObjectDao extends RWikiObjectDao
{

	/**
	 * Update a History Object
	 * 
	 * @param rwo
	 */
	void update(RWikiHistoryObject rwo);

	/**
	 * Create a new History object by cloning a Current Object
	 * 
	 * @param rwo
	 * @return
	 */
	RWikiHistoryObject createRWikiHistoryObject(RWikiCurrentObject rwo);

	/**
	 * Find a revision based ont the rwikiobjectid of the reference
	 * 
	 * @param rwo
	 * @param revision
	 * @return
	 */
	RWikiHistoryObject getRWikiHistoryObject(RWikiObject rwo, int revision);

	/**
	 * Find all revisions based on the rwikiobjectid of the reference
	 * 
	 * @param reference
	 * @return
	 */
	List findRWikiHistoryObjects(RWikiObject reference);

	/**
	 * Find all revisions based on the rwikiobjectid of the reference in reverse
	 * 
	 * @param reference
	 * @return
	 */
	List findRWikiHistoryObjectsInReverse(RWikiObject reference);

}

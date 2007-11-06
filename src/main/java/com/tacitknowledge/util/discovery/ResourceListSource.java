/* Copyright 2007 Tacit Knowledge LLC
 * 
 * Licensed under the Tacit Knowledge Open License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License. You may
 * obtain a copy of the License at http://www.tacitknowledge.com/licenses-1.0.
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tacitknowledge.util.discovery;

/**
 * 
 * 
 * @author  Scott Askew (scott@tacitknowledge.com)
 * @version $Id: ResourceListSource.java,v 1.1 2004/03/15 07:39:43 scott Exp $
 */
public interface ResourceListSource
{
    /**
     * Returns a list of the names of the resources in the given directory that
     * match the specified search criteria.
     * 
     * @param  basePath the directory to search; the search is <strong>not</strong>
     *         recursive; may be <code>null</code>
     * @param  criteria the search criteria to filter on; may be <code>null</code>
     * @return a list of the names of the resources in the given directory that
     *         match the specified search criteria; if no matched are found, then
     *         an empty array is returned
     */
    public String[] getResources(String basePath, ResourceCriteria criteria);
}
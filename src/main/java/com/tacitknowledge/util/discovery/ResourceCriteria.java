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
 * Used to define search criteria for the class discovery API.  Instances of 
 * this interface are used as filters by <code>ResourceListSource</code>s.
 * 
 * @author  Scott Askew (scott@tacitknowledge.com)
 * @version $Id: ResourceCriteria.java,v 1.1 2004/03/15 07:39:43 scott Exp $
 * @see     ResourceListSource#getResources(String, ResourceCriteria)
 */
public interface ResourceCriteria
{
    /**
     * Determines if the given resource matches specific search criteria.
     * 
     * @param  resourceName the name of the resource to match
     * @return <code>true</code> if the given resource matches specific search
     *         criteria; otherwise, <code>false</code>
     */
    public boolean matches(String resourceName);
}

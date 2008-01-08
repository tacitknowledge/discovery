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

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Source for resources within the classes directory in web archive (WAR) files. 
 * 
 * @author  Scott Askew (scott@tacitknowledge.com)
 * @version $Id: WebDirectoryResourceListSource.java,v 1.1 2004/03/19 21:38:44 scott Exp $
 */
class WebDirectoryResourceListSource extends DirectoryResourceListSource
{
    /**
     * The full path on-disk to /WEB-INF
     */
    private String path = null;
    
    /**
     * Creates a new <code>WebDirectoryResourceListSource</code>
     * 
     * @param path the full on-disk path to WEB-INF
     */
    public WebDirectoryResourceListSource(String path)
    {
        this.path = ClasspathUtils.getCanonicalPath(path);
    }
    
    /**
     * {@inheritDoc}
     */
    protected List getDirectories()
    {
        List dirs = new ArrayList(1);
        dirs.add(path + File.separator + "classes");
        return dirs;
    }
}
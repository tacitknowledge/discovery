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
import java.io.FileFilter;

/**
 * 
 * 
 * @author  Scott Askew (scott@tacitknowledge.com)
 * @version $Id: DirectoryFilter.java,v 1.2 2005/03/23 21:53:10 mike Exp $
 */
class DirectoryFilter implements FileFilter
{
    /**
     * @see java.io.FilenameFilter#accept(File, String)
     */
    public boolean accept(File f)
    {
        return !f.isDirectory();
    }
}

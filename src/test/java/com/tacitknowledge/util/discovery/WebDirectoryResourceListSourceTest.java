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
import java.util.List;

import junit.framework.TestCase;

/**
 * Tests the <code>WebDirectoryResourceListSource</code> class. 
 * 
 * @author  Scott Askew (scott@tacitknowledge.com)
 * @version $Id: WebDirectoryResourceListSourceTest.java,v 1.1 2004/03/19 21:38:43 scott Exp $
 */
public class WebDirectoryResourceListSourceTest extends TestCase
{
    /**
     * Constructor for WebDirectoryResourceListSourceTest.
     *
     * @param name the name of the test to run
     */
    public WebDirectoryResourceListSourceTest(String name)
    {
        super(name);
    }
    
    /**
     * Tests the <code>getDirectories</code> method. 
     */
    public void testDirectories()
    {
        String path = File.separator + "test";
        String classPath = path + File.separator + "classes";
        WebDirectoryResourceListSource source = new WebDirectoryResourceListSource(path);
        List result = source.getDirectories();
        assertEquals(1, result.size());
        assertEquals(classPath, (String) result.get(0));
    }
}

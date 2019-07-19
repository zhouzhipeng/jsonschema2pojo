/**
 * Copyright © 2010-2017 Nokia
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jsonschema2pojo.cli;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.jsonschema2pojo.Jsonschema2Pojo;

/**
 * Main class, providing a command line interface for jsonschema2pojo.
 */
public final class Jsonschema2PojoCLI {

    private Jsonschema2PojoCLI() {
    }

    /**
     * Main method, entry point for the application when invoked via the command
     * line. Arguments are expected in POSIX format, invoke with --help for
     * details.
     * 
     * @param args
     *            Incoming arguments from the command line
     * @throws FileNotFoundException
     *             if the paths specified on the command line are not found
     * @throws IOException
     *             if the application is unable to read data from the paths
     *             specified
     */
    public static void main(String[] args) throws IOException {
        
        args=new String[]{
                "--source", "CreateAccountRequest.json",
                "--source-type", "json",
                "--target" ,"/Users/zhouzhipeng/IdeaProjects/jsonschema2pojo/jsonschema2pojo-cli/src/test/java",
                "--package","com.zhouzhipeng.test",
                "--use-inner-class-builders",
                "--remove-old-output",
                "--omit-hashcode-and-equals",
                "--omit-tostring",
                "--disable-setters",
                "--disable-getters",
                "--annotation-style","gson",
                "--generate-builders"
        };

        Arguments arguments = new Arguments().parse(args);

        if (arguments.isUseCommonsLang3()) {
            System.err.println("--commons-lang3 is deprecated. Please remove the argument from your command-line arguments.");
        }


        Jsonschema2Pojo.generate(arguments);
        
    }


}

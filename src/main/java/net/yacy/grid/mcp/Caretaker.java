/**
 *  Caretaker
 *  Copyright 16.01.2017 by Michael Peter Christen, @orbiterlab
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with this program in the file lgpl21.txt
 *  If not, see <http://www.gnu.org/licenses/>.
 */

package net.yacy.grid.mcp;

import net.yacy.grid.tools.Logger;

public class Caretaker implements Runnable {

    private boolean shallRun;

    public Caretaker() {
        this.shallRun = true;
    }

    @Override
    public void run() {
        while (this.shallRun) {
            try {



                Thread.sleep(10000);
            } catch (Throwable e) {
                Logger.error("Caretaker fail", e);
            }
        }
    }

    public void shutdown() {
        this.shallRun = false;
        Thread.currentThread().interrupt();
    }

}

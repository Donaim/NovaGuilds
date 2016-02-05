/*
 *     NovaGuilds - Bukkit plugin
 *     Copyright (C) 2015 Marcin (CTRL) Wieczorek
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package co.marcin.novaguilds.runnable;

import co.marcin.novaguilds.util.LoggerUtils;
import co.marcin.novaguilds.util.TabUtils;
import org.bukkit.Bukkit;

public class RunnableRefreshTablist implements Runnable {
	@Override
	public void run() {
		TabUtils.refresh();

		if(Bukkit.getOnlinePlayers().size() > 0) {
			LoggerUtils.info("TabList refreshed (" + Bukkit.getOnlinePlayers().size() + " players)");
		}
	}
}

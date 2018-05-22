/*
 * Copyright the original author or authors.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.schildbach.pte;

import okhttp3.HttpUrl;

/**
 * @author Stephane Berube
 */
public class BritishColumbiaProvider extends AbstractNavitiaProvider {
    private static String API_REGION = "ca-bc";

    public BritishColumbiaProvider(final HttpUrl apiBase, final String authorization) {
        super(NetworkId.BRITISHCOLUMBIA, apiBase, authorization);
        setTimeZone("America/Vancouver");
    }

    public BritishColumbiaProvider(final String authorization) {
        super(NetworkId.BRITISHCOLUMBIA, authorization);
        setTimeZone("America/Vancouver");
    }

    @Override
    public String region() {
        return API_REGION;
    }
}
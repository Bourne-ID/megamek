/**
 * MegaMek - Copyright (C) 2005 Ben Mazur (bmazur@sev.org)
 * 
 *  This program is free software; you can redistribute it and/or modify it 
 *  under the terms of the GNU General Public License as published by the Free 
 *  Software Foundation; either version 2 of the License, or (at your option) 
 *  any later version.
 * 
 *  This program is distributed in the hope that it will be useful, but 
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY 
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License 
 *  for more details.
 */
package megamek.common.weapons;

import megamek.common.TechConstants;

/**
 * @author Sebastian Brocks
 */
public class CLLRT19 extends LRTWeapon {

    /**
     * 
     */
    private static final long serialVersionUID = 6738834696795634552L;

    /**
     * 
     */
    public CLLRT19() {
        super();
        this.techLevel.put(3071, TechConstants.T_CLAN_TW);
        this.name = "LRT 19";
        this.setInternalName("CLLRTorpedo19");
        this.setInternalName("CLLRT19");
        this.heat = 0;
        this.rackSize = 19;
        this.minimumRange = WEAPON_NA;
        this.waterShortRange = 7;
        this.waterMediumRange = 14;
        this.waterLongRange = 21;
        this.waterExtremeRange = 28;
        this.tonnage = 3.8f;
        this.criticals = 0;
        this.bv = 218;
        introDate = 3060;
        techLevel.put(3060, techLevel.get(3071));
        availRating = new int[] { RATING_X, RATING_X, RATING_E };
        techRating = RATING_C;
    }
}

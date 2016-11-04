/*
 * Copyright (C) 2016 UMR AMAP (botAnique et Modélisation de l'Architecture des Plantes et des végétations.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package fr.amap.amapvox.als.las;

import fr.amap.amapvox.als.LasHeader;
import java.util.ArrayList;

/**
 *
 * @author Julien Heurtebize (julienhtbe@gmail.com)
 */
public class Las {
    
    private LasHeader header;
    private ArrayList<VariableLengthRecord> variableLengthRecords;
    private ArrayList<? extends PointDataRecordFormat> pointDataRecords;

    public Las(LasHeader header, ArrayList<VariableLengthRecord> variableLengthRecords, ArrayList<? extends PointDataRecordFormat> pointDataRecords) {
        this.header = header;
        this.variableLengthRecords = variableLengthRecords;
        this.pointDataRecords = pointDataRecords;
    }

    public LasHeader getHeader() {
        return header;
    }

    public ArrayList<? extends PointDataRecordFormat> getPointDataRecords() {
        return pointDataRecords;
    }

    public ArrayList<VariableLengthRecord> getVariableLengthRecords() {
        return variableLengthRecords;
    }
    
    public double getTransformedX(int index){
        
        double transformedX = (pointDataRecords.get(index).getX() * header.getxScaleFactor()) + header.getxOffset();
        
        return transformedX;
    }
    
    public double getTransformedY(int index){
        
        double transformedY = (pointDataRecords.get(index).getY() * header.getyScaleFactor()) + header.getyOffset();
        
        return transformedY;
    }
    
    public double getTransformedZ(int index){
        
        double transformedZ = (pointDataRecords.get(index).getZ() * header.getzScaleFactor()) + header.getzOffset();
        
        return transformedZ;
    }
    
    
    
}

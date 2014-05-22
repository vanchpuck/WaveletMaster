/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jonnygold.wavelet.filters;

/**
 *
 * @author Vanchpuck
 */
public class HaarFilter extends WaveletFilter{
    
    private HaarFilter(double[] h, double[] g, double[] ih, double[] ig){
        super(h, g, ih, ig);
    }
    
    public static HaarFilter getInstance(){
    	double[] h = new double[]{0.5,0.5};
        double[] g = new double[]{0.5,-0.5};
        
        double[] ih = new double[]{1,1};
        double[] ig = new double[]{1,-1};
        
        return new HaarFilter(h, g, ih, ig);
    }
    
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jonnygold.wavelet.filters;

/**
 *
 * @author Vanchpuck
 */
public class DB4Filter extends WaveletFilter{
    
    private DB4Filter(double[] h, double[] g, double[] ih, double[] ig){
        super(h, g, ih, ig);
    }
    
    public static DB4Filter getInstance(){
    	double[] h = new double[]{0.34150635094622050000, 0.59150635094586690000, 0.15849364905377947000, -0.09150635094586698200};
        double[] g = new double[]{-0.09150635094586698200, -0.15849364905377947000, 0.59150635094586690000, -0.34150635094622050000};
        
        double[] ih = new double[]{0.6830127018922193, 1.183012701892222, 0.3169872981077807, -0.18301270189221935};
        double[] ig = new double[]{-0.18301270189221935, -0.3169872981077807, 1.183012701892222, -0.6830127018922193};
        
        return new DB4Filter(h, g, ih, ig);
    }
    
}

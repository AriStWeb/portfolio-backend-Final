
package com.argentinaprograma.miPortfolio.miPortfolio.Service;

import com.argentinaprograma.miPortfolio.miPortfolio.Model.Banner;
import java.util.List;


public interface IBannerService{
    
   public List<Banner> getBanner();
    
    public void saveBanner (Banner expLab);
    
    public void deleteBanner(Long id);
     
    public Banner findBanner(Long id);
    
}
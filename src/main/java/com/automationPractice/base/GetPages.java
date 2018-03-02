package com.automationPractice.base;

import com.automationPractice.pages.HomePage;
import com.automationPractice.util.CaptureScreenShot;

public class GetPages {
//	common classes
	 public Browser browser=null;
	public Keywords key = null;
	public CaptureScreenShot screenshot=null;
	
//	pages
   public HomePage homePage=null;
    
    
	public Keywords getKey() {
		if (key == null) {
			try {
				return new Keywords();
			} catch (Exception e) {
				// TODO Auto-generated catch block

				e.printStackTrace();
			}
		}

		return key;
	}
	public Browser getBrowser() {
		if (browser == null) {
			try {
				return new Browser();
			} catch (Exception e) {
				// TODO Auto-generated catch block

				e.printStackTrace();
			}
		}

		return browser;
	}
	
	public CaptureScreenShot getScreenShoot() {
		if (screenshot == null) {
			try {
				return new CaptureScreenShot();
			} catch (Exception e) {
				// TODO Auto-generated catch block

				e.printStackTrace();
			}
		}

		return screenshot;
	}
	
	public HomePage gethomePage(){
		if (homePage == null) {
			try {
				return new HomePage();
			} catch (Exception e) {
				// TODO Auto-generated catch block

				e.printStackTrace();
			}
		}

		return homePage;
	}
}

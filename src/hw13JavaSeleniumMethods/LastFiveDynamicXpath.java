package hw13JavaSeleniumMethods;

public class LastFiveDynamicXpath {

	// 10) Tag with parents (source:https://www.bestbuy.com/)
	/*//li[@class='bottom-nav-menu-item']//parent::ul[@class='bottom-nav-right'] Account field
	 * //div[@class='flyout-button-wrapper']//parent::li[@class='bottom-nav-menu-item'][1] Order Status field
	 * //div[@id='shop-master-ad-64285342']//parent::div[@class='widgets-view-esi'] LOGO
	 * //a[@data-lid='hdr_carticon']//parent::div Cart field
	 * //p[@class='sw-banner']//parent::div Deal of the day field
	 */

	//11) Tag with child (source:https://www3.mtb.com/)
	/*//div[@class='header-misc']//child::ul[@class='header-misc-container'] Log In field
	 * //div[@class='header-logo']//child::a[@class='header-logo-link'] LOGO field
	 * //div[@class='xfpage page basicpage']//child::div[@class='xfpage page basicpage'] Follow your financial dreams field
	 * //div[@id='containerWidthIris']//child::div[@class='_2k_Ki _3o3XP'] Baby & Kida field (https://www.jcpenney.com/) 
	 * //li[@id='searchBlock']//child::div LOGO field
	 */
	
	//12)Tag with following sibling {younger brother} (Source: https://www.jnj.com/)
	/*//div[@class='ListPromo']//following-sibling::ul[@class='ListPromo-items'] latest news field
	 * //form [@class='CookieBanner bsp-onDomInsert-inserted-27 jnj-cookie-banner-item']//following-sibling::div[@id='fb-root'] LOGO field
	 * //div[@id='skipLinkTarget']//following-sibling::footer[@class='Footer'] Latest News field
	 * //div[@class='extModal-body']//following-sibling::div[@class='extModal-cta'] Career field
	 * //div[@class='Banner-link']//following-sibling::div[@class='Banner-link-text'] Contact Us field
	 */
	
	//13) Tag with preceding sibling {elder brother} (Source:Kay Jewelers)
	//div[@class='close-btn visible-xs visible-sm']//preceding-sibling::button[@id='groupbyapi-search-button'] Search field
	//input[@id='groupbySearchTermsUrl']//preceding-sibling::input[@type='hidden'] Customize field
	//link[@rel='stylesheet']//preceding-sibling::script[@type='text/javascript'][3] Apply Now field
	//link[@rel='stylesheet']//preceding-sibling::style[@type='text/css'] Sign In field
	//p[@align='center']//preceding-sibling::img[@class='services-icon'] Watches field
	 

	//14) Tag with inner text/attribute (if multiple is present) (Source:https://www.montgomerycollege.edu/)
	 
	 /*//a[text()='Apply Now']//parent::li Apply Now field
	  * (//a[text()='Contact Us']//parent::li)[1] Contact Us field
	  * //a[text()='Donate to Scholarships']//parent::p Donate to Scholarships field
	  * //a[text()='Return to Campus'] Return to Campus field
	  * //a[text()='Vaccine Requirements']//parent::p Vaccine Requirments field
	  */


}

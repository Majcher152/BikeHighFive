
$(document).ready(function() {		
	function Scroll() {
		var navigation = document.getElementById('navbarResponsive'),
		navigation_Title = document.getElementById('navigationID_Title'),
		documentEl = $(document),
		ypos = window.pageYOffset,
		howItWorks = $(document.getElementById('howItWorksID')), 
		howItWorksOffset = howItWorks.offset().top / 2,
		howItWorks_2 = $(document.getElementById('howItWorksID_2')), 
		howItWorks_2Offset = howItWorks_2.offset().top*0.7,
		about = $(document.getElementById('about')), 
		aboutOffset = about.offset().top*0.7;
		
		
		if (  ypos > howItWorksOffset) {
			howItWorks.removeClass('hidden');
		} 
		if (ypos > howItWorks_2Offset ) { 
			howItWorks_2.removeClass('hidden');
		} 
		if (documentEl.scrollTop() > aboutOffset ) {
			about.removeClass('hidden');
		}
		//przestało działać
		if (ypos > howItWorksOffset) {
			navigation.style.height = "45px";
			navigation.style.fontSize = "16px";
			navigation_Title.fontSize = "20px";
		} else {
			navigation.style.height = "100px";
			navigation.style.fontSize = "22px";
			navigation_Title.fontSize = "24px";
		}
	}

	window.addEventListener("scroll", Scroll);
	document.getElementById("howItWorks_Button").addEventListener("click", Scroll);
					
});
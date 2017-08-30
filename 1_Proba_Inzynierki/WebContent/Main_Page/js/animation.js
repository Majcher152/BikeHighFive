
$(document).ready(function() {		
	function Scroll() {
		var navigation = document.getElementById('navigationID'),
		documentEl = $(document),
		ypos = window.pageYOffset,
		howItWorks = $(document.getElementById('howItWorksID')), 
		howItWorksOffset = howItWorks.offset().top / 2,
		howItWorks_2 = $(document.getElementById('howItWorksID_2')), 
		howItWorks_2Offset = howItWorks.offset().top / 2,
		about = $(document.getElementById('about')), 
		aboutOffset = howItWorks.offset().top / 2;
		
			
		if (documentEl.scrollTop() > howItWorksOffset && howItWorks.hasClass('hidden')) {
			// zle sa te add i remove :/
			howItWorks.removeClass('hidden');
			howItWorks_2.addClass('hidden');
			about.addClass('hidden');
		} else if ( howItWorksOffset <= documentEl.scrollTop() < howItWorks_2Offset && howItWorks_2.hasClass('hidden')) {			
			howItWorks.addClass('hidden');
			howItWorks_2.removeClass('hidden');
			about.addClass('hidden');
		} else if (howItWorks_2Offset <= documentEl.scrollTop()<  aboutOffset && about.hasClass('hidden')) {			
			howItWorks.addClass('hidden');
			howItWorks_2.addClass('hidden');
			about.removeClass('hidden');
		}
		
		if (ypos > howItWorksOffset) {
			navigation.style.height = "45px";
		} else {
			navigation.style.height = "100px";
		}
	}

	window.addEventListener("scroll", Scroll);
	document.getElementById("howItWorks_Button").addEventListener("click", Scroll);
					
});
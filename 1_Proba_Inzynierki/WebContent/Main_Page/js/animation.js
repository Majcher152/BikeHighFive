

$(document).ready(function(){
	
	(function(){
		//var aboutEl = $('about'),
	//nie dziala :c //	var aboutEl =  $(document.getElementById('services')),
			aboutElOffset = aboutEl.offset().top/2,
			documentEl = $(document);
		
		documentEl.on('scroll', function(){
			if(documentEl.scrollTop() > aboutElOffset && aboutEl.hasClass('hidden'))
			{
				aboutEl.removeClass('hidden');
			}
		});
	})();
});  

$(document).ready(function(){
	function Scroll(){
		var top = document.getElementById('navigation');
		var ypos = window.pageYOffset;
		if(ypos > 610 ){
			top.style.height = "45px";
		} else {
		top.style.height = "100px";
		}
	}
	
	window.addEventListener("scroll", Scroll)
});
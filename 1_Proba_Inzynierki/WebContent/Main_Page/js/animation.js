
$(document).ready(function() {		
	function Scroll() {
		var navigation = document.getElementById('navigationID'),
		navigation_Title = document.getElementById('navigationID_Title'),
		list = document.getElementById('navigationID').getElementsByClassName('navbar-link'),
		documentEl = $(document),
		ypos = window.pageYOffset,
		howItWorks = $(document.getElementById('howItWorksID')), 
		howItWorksOffset = howItWorks.offset().top / 2,
		howItWorks_2 = $(document.getElementById('howItWorksID_2')), 
		howItWorks_2Offset = howItWorks_2.offset().top*0.7,
		about = $(document.getElementById('about')), 
		aboutOffset = about.offset().top*0.7;
	//	var flag = false;
		
//	console.log(list);
		
		if (  ypos > howItWorksOffset) {
			howItWorks.removeClass('hidden');
		} 
		if (ypos > howItWorks_2Offset ) { 
			howItWorks_2.removeClass('hidden');
		} 
		if (documentEl.scrollTop() > aboutOffset ) {
			about.removeClass('hidden');
		}

	//	console.log(howItWorksOffset+ " " +ypos);
		if (ypos > howItWorksOffset) {
	//		console.log(1);
			navigation.style.height = "45px";
			document.getElementById('navigationID_Title').style.fontSize = "20px";
			document.getElementById('howItWorks_Button').style.fontSize = "18px";
			document.getElementById('about_Button').style.fontSize = "18px";
			document.getElementById('contact_Button').style.fontSize = "18px";
			document.getElementById('singUp_Button').style.fontSize = "18px";
			document.getElementById('logIn_Button').style.fontSize = "18px";
	//		flag = false;
	} else if (ypos < howItWorksOffset) {
		//	console.log(2);
			navigation.style.height = "100px";
			document.getElementById('navigationID_Title').style.fontSize = "30px";
			document.getElementById('howItWorks_Button').style.fontSize = "22px";
			document.getElementById('about_Button').style.fontSize = "22px";
			document.getElementById('contact_Button').style.fontSize = "22px";
			document.getElementById('singUp_Button').style.fontSize = "22px";
			document.getElementById('logIn_Button').style.fontSize = "22px";
	//		flag = true;
		}
	}

	window.addEventListener("scroll", Scroll);
	document.getElementById("howItWorks_Button").addEventListener("click", Scroll);
					
});
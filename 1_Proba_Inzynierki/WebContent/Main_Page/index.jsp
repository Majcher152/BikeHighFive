<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<jsp:include page="header_Main.jsp" />

<!-- Header -->
    <header class="intro-header">
      <div class="container">
        <div class="intro-message">
          <h1 id ="bhfh1">Bike^5</h1>
          <h3 id ="bhfh3">Give your bike a high five today!</h3>
          <hr class="intro-divider">
          <ul class="list-inline intro-social-buttons">
            <li class="list-inline-item">
              <a href="join_Now.jsp" class="btn btn-secondary btn-lg">
                <i class="fa fa-handshake-o fa-fw" aria-hidden="true"></i>
                <span class="network-name">Join Now</span>
              </a>
            </li>
            <li class="list-inline-item">
              <a href="log_In.jsp" class="btn btn-secondary btn-lg">
                <i class="fa fa-bicycle fa-fw" aria-hidden="true"></i>
                <span class="network-name"> Log In</span>
              </a>
            </li>
            <li class="list-inline-item">
              <a href="index.jsp#services" class="btn btn-secondary btn-lg">
                <i class="fa fa-globe fa-fw"></i> 
                <span class="network-name">Learn more</span>
              </a>
            </li>
          </ul>
        </div>
      </div>
    </header>



    <!-- Page Content -->
    <section class="content-section-a" id ="services">

      <div class="container">
        <div class="row">
          <div class="col-lg-5 ml-auto">
            <hr class="section-heading-spacer">
            <div class="clearfix"></div>
            <h2 class="section-heading">SHIT SHIT SHIT SHIT<br>BIKE IS IT BIKE BIKE BIKE</h2>
            <p class="lead">A lama in my living room.</p>
          </div>
          <div class="col-lg-5 mr-auto">
            <img class="img-fluid" src="/1_Proba_Inzynierki/Main_Page/img/Main_Bike.jpg" alt="">
          </div>
        </div>

      </div>
      <!-- /.container -->
    </section>

    <section class="content-section-b">

      <div class="container">

        <div class="row">
          <div class="col-lg-5 mr-auto order-lg-2">
            <hr class="section-heading-spacer">
            <div class="clearfix"></div>
            <h2 class="section-heading">HARD TIMES</h2>
            <p class="lead">GONNA MAKE U WONDER WHY U EVEN TRY <br> HARD TIMES <br>
            gonna take your laugh and make u cry</p>
          </div>
          <div class="col-lg-5 ml-auto order-lg-1">
            <img class="img-fluid" src="/1_Proba_Inzynierki/Main_Page/img/b5.jpg" alt="">
          </div>
        </div>

      </div>
      <!-- /.container -->

    </section>
    <!-- /.content-section-b -->

    <section class="content-section-a" id="about">

      <div class="container">

        <div class="row">
          <div class="col-lg-5 ml-auto">
            <hr class="section-heading-spacer">
            <div class="clearfix"></div>
            <h2 class="section-heading">About us</h2>
            <p class="lead">Łukasz Majcher in 2017 created B^5. His goal was to help people find better roads for cycling <br>
            and encourage people to start doin' it with his little help. </p>
          </div>
          <div class="col-lg-5 mr-auto ">
            <img class="img-fluid" src="/1_Proba_Inzynierki/Main_Page/img/b8.jpg" alt="">
          </div>
        </div>

      </div>
      <!-- /.container -->

    </section>
    <!-- /.content-section-a -->

    <aside class="banner">

      <div class="container">
      
      
    <!-- Contact -->
    <section id="contact">
      <div class="container">
        <div class="row">
          <div class="col-lg-12 text-center">
            <h2 class="section-heading">Contact Us</h2>
            <h3 class="section-subheading">If u have any questions for us, please don't be afraid to ask.</h3>
          </div>
        </div>
        <div class="row">
          <div class="col-lg-12">
            <form id="contactForm" name="sentMessage" novalidate>
              <div class="row">
                <div class="col-md-6">
                  <div class="form-group">
                    <input class="form-control" id="name" type="text" placeholder="Your Name *" required data-validation-required-message="Please enter your name.">
                    <p class="help-block text-danger"></p>
                  </div>
                  <div class="form-group">
                    <input class="form-control" id="email" type="email" placeholder="Your Email *" required data-validation-required-message="Please enter your email address.">
                    <p class="help-block text-danger"></p>
                  </div>
                  <div class="form-group">
                    <input class="form-control" id="phone" type="tel" placeholder="Your Phone *" required data-validation-required-message="Please enter your phone number.">
                    <p class="help-block text-danger"></p>
                  </div>
                </div>
                <div class="col-md-6">
                  <div class="form-group">
                    <textarea class="form-control" id="message" placeholder="Your Message *" required data-validation-required-message="Please enter a message."></textarea>
                    <p class="help-block text-danger"></p>
                  </div>
                </div>
                <div class="clearfix"></div>
                <div class="col-lg-12 text-center">
                  <div id="success"></div>
                  <button id="sendMessageButton" class="btn btn-xl" type="submit">Send Message</button>
                </div>
              </div>
            </form>
          </div>
        </div>
      </div>
    </section>
      
<!-- 
        <div class="row">
          <div class="col-lg-6 my-auto">
            <h2>Connect to Start Bootstrap:</h2>
          </div>
          <div class="col-lg-6 my-auto">
            <ul class="list-inline banner-social-buttons">
              <li class="list-inline-item">
                <a href="#" class="btn btn-secondary btn-lg">
                  <i class="fa fa-twitter fa-fw"></i>
                  <span class="network-name">Twitter</span>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#" class="btn btn-secondary btn-lg">
                  <i class="fa fa-github fa-fw"></i>
                  <span class="network-name">Github</span>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#" class="btn btn-secondary btn-lg">
                  <i class="fa fa-linkedin fa-fw"></i>
                  <span class="network-name">Linkedin</span>
                </a>
              </li>
            </ul>
          </div>
        </div>
-->
      </div>
      <!-- /.container -->

    </aside>
    <!-- /.banner -->
    
    

   <jsp:include page="footer_Main.jsp" />
   

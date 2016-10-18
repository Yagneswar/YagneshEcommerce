<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<jsp:include page="link.jsp"></jsp:include>
</head>
<body>
<!--header-->
<div class="header">
	<div class="header-top">
		<div class="container">
			<div class="social">
				<ul>
					<li><a href="#"><i class="facebok"> </i></a></li>
					<li><a href="#"><i class="twiter"> </i></a></li>
					<li><a href="#"><i class="inst"> </i></a></li>
					<li><a href="#"><i class="goog"> </i></a></li>
						<div class="clearfix"></div>	
				</ul>
			</div>
			<div class="header-left">
			
				<div class="search-box">
					<div id="sb-search" class="sb-search">
						<form action="#" method="post">
							<input class="sb-search-input" placeholder="Enter your search term..." type="search"  id="search">
							<input class="sb-search-submit" type="submit" value="">
							<span class="sb-icon-search"> </span>
						</form>
					</div>
				</div>
			
<!-- search-scripts -->
					<script src="resources/js/classie.js"></script>
					<script src="resources/js/uisearch.js"></script>
						<script>
							new UISearch( document.getElementById( 'sb-search' ) );
						</script>
					<!-- //search-scripts -->

				<div class="ca-r">
					<div class="cart box_1">
						<a href="checkout.html">
						<h3> <div class="total">
							<span class="simpleCart_total"></span> </div>
							<img src="resources/images/cart.png" alt=""/></h3>
						</a>
						<p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>

					</div>
				</div>
					<div class="clearfix"> </div>
			</div>
				
		</div>
		</div>
		<div class="container">
			<div class="head-top">
				<div class="logo">
					<h1><a href="<c:url value="index"/>">Mattress</a></h1>
				</div>
		  <div class=" h_menu4">
				<ul class="memenu skyblue">
					  <li><a class="color8" href="<c:url value="index"/>">HOME</a></li>	
				      <li><a class="color1" href="<c:url value="about"/>">ABOUT US</a>
				      	<div class="mepanel">
						<div class="row">
							<div class="col1">
								<div class="h_nav">
									<ul>
										<li><a href="products">Bedskirt</a></li>
										<li><a href="products">Blanket/Throw</a></li>
										<li><a href="products">Collection/Duvet</a></li>
										<li><a href="products">Comforter</a></li>
										<li><a href="products">Comforter Set</a></li>
										<li><a href="products">Decorative Pillow</a></li>
										<li><a href="products">Mattress Pad </a></li>
										<li><a href="products">Mattress Topper</a></li>
										<li><a href="products">Pillow</a></li>
										<li><a href="products">Pillow Protector</a></li>
										
									</ul>	
								</div>							
							</div>
							<div class="col1">
								<div class="h_nav">
									<ul>
										<li><a href="products">Alpaca</a></li>
										<li><a href="products">Cashmere</a></li>
										<li><a href="products">Cotton</a></li>
										<li><a href="products">Cotton Blend</a></li>
										<li><a href="products">Down</a></li>
										<li><a href="products">Down Alternative</a></li>
										<li><a href="products">Egyptian Cotton</a></li>
										<li><a href="products">Modal</a></li>
										<li><a href="products">Pima Cotton</a></li>
										<li><a href="products">Silk </a></li>
										
									</ul>	
								</div>							
							</div>
							<div class="col1">
								<div class="h_nav">
									<ul>
										<li><a href="products">Bedskirt</a></li>
										<li><a href="products">Blanket/Throw</a></li>
										<li><a href="products">Collection/Duvet</a></li>
										<li><a href="products">Comforter</a></li>
										<li><a href="products">Comforter Set</a></li>
										<li><a href="products">Decorative Pillow</a></li>
										<li><a href="products">Mattress Pad </a></li>
										<li><a href="products">Mattress Topper</a></li>
										<li><a href="products">Pillow</a></li>
										<li><a href="products">Pillow Protector</a></li>
									</ul>	
								</div>												
							</div>
						  </div>
						</div>
					</li>
				    <li class="grid"><a class="color2" href="<c:url value="products"/>">SERVICES</a>
					  	<div class="mepanel">
						<div class="row">
							<div class="col1">
								<div class="h_nav">
									<ul>
										<li><a href="products">Bedskirt</a></li>
										<li><a href="products">Blanket/Throw</a></li>
										<li><a href="products">Collection/Duvet</a></li>
										<li><a href="products">Comforter</a></li>
										<li><a href="products">Comforter Set</a></li>
										<li><a href="products">Decorative Pillow</a></li>
										<li><a href="products">Mattress Pad </a></li>
										<li><a href="products">Mattress Topper</a></li>
										<li><a href="products">Pillow</a></li>
										<li><a href="products">Pillow Protector</a></li>
										
									</ul>	
								</div>								
							</div>
							<div class="col1">
								<div class="h_nav">
									<ul>
										<li><a href="products">Alpaca</a></li>
										<li><a href="products">Cashmere</a></li>
										<li><a href="products">Cotton</a></li>
										<li><a href="products">Cotton Blend</a></li>
										<li><a href="products">Down</a></li>
										<li><a href="products">Down Alternative</a></li>
										<li><a href="products">Egyptian Cotton</a></li>
										<li><a href="products">Modal</a></li>
										<li><a href="products">Pima Cotton</a></li>
										<li><a href="products">Silk </a></li>
										
									</ul>		
								</div>							
							</div>
							<div class="col1">
								<div class="h_nav">
									
									<ul>
										<li><a href="products">Bedskirt</a></li>
										<li><a href="products">Blanket/Throw</a></li>
										<li><a href="products">Collection/Duvet</a></li>
										<li><a href="products">Comforter</a></li>
										<li><a href="products">Comforter Set</a></li>
										<li><a href="products">Decorative Pillow</a></li>
										<li><a href="products">Mattress Pad </a></li>
										<li><a href="products">Mattress Topper</a></li>
										<li><a href="products">Pillow</a></li>
										<li><a href="products">Pillow Protector</a></li>
									</ul>	
								</div>												
							</div>
						  </div>
						</div>
			    </li>
				<li><a class="color4" href="login">LOGIN</a></li>				
				<li><a class="color6" href="contact">CONTACT</a></li>
				<li><a class="color6" href="viewall">VIEW ALL</a></li>
				
			  </ul> 
			</div>
				
				<div class="clearfix"> </div>
		</div>
		</div>
	</div>
	
	<div class="banner">
		<div class="container">
			  <script src="resources/js/responsiveslides.min.js"></script>
			  
			  
  <script>
    $(function () {
      $("#slider").responsiveSlides({
      	auto: true,
      	nav: true,
      	speed: 500,
        namespace: "callbacks",
        pager: true,
      });
    });
  </script>
			<div  id="top" class="callbacks_container">
			<ul class="rslides" id="slider">
			    <li>
					
						<div class="banner-text">
							<h3>Banner Text1   </h3>
						<p>Now you can, literally,
sleep on it for 100
nights and decide if mattress
suits you</p>
						  
						</div>
				
				</li>
				
				<li>
					
						<div class="banner-text">
							<h3>Banner text2  </h3>
						<p>It is incredible what a single night of blissful, uninterrupted sleep can earn you: a productive day at work, excellent (and faster) work-out results.</p>
												
                          
						</div>
					
				</li>
				
				<li>
						<div class="banner-text">
							<h3>Banner Text3</h3>
						<p>People go for free pillows without realising there is nothing free. It is ideal to invest in great pillows and then change them every two years"</p>
								

						</div>
					
				</li>
			</ul>
		</div>

	</div>
	</div>
	</body>
	</html>
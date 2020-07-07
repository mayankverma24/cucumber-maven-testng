Feature: Office365 User Creation 

Scenario: Verify the user creation 
	Given User is logged in with santhosh@tuebroatest.onmicrosoft.com and Tria1Tue@123 
	When User is on Admin Console page 
	When User create following users from All Users page 
		|userName		|name			|firstName	|lastName	|location		|jobTitle	|department	|
		|JohnOliver		|John Oliver	|John		|Oliver		|India			|Manager	|Sales		|
		|AndrewDoss		|Andrew Doss	|Andrew		|Doss		|United States	|Supervisor	|Sales		|
		|DavidPeare		|David Peare	|David		|Peare		|United Kingdom	|Team Lead	|Technology	|
	Then User is navigated to All Users page 
	And Following User Names are displayed on the page 
		|userName		|
		|JohnOliver		|
		|AndrewDoss		|
		|DavidPeare		|

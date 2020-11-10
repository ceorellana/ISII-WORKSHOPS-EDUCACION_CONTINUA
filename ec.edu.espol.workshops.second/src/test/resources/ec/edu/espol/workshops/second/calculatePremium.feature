Feature: Calculate the insurance prime for a customer
	Scenario: Customer has no valid license
		Given customer has no valid license
		When I calculate the premium fee
		Then I should get "-1"
		
	Scenario Outline: Customer can apply for premium fee
		Given customer is <sex>
		And is <marriage>
		And is 30 years old
		When I calculate the premium fee
		Then I should get <price>
		
	Examples:
	| sex | marriage | price |
	| female | married | 300 |
	| male | not married | 500 |
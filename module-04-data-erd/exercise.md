= Exercise: Create an Entity Relationship Diagram

The next chapter is a description of an insurance business. It outlines how there business operates and explains the
processes a new to develop system should support.

In groups of 2-3 trainees, your job is to:

* Read the text
* Identify Entities, Attributes and Relationships
* Create and Entity Relationship Diagram depicting the data used by the company's processes
* Identify and note cardinalities on the relationships as best you can

When all groups have finished, compare diagrams and discuss any differences you may have found.


== UltraValue Insurance Business Description

At UltraValue Insurance (UVI) we strive to keep our loyal customers happy, no matter what life throws at them. In this modern
age we understand the need for modernization and innovation and therefore we want to create a new state-of-the art system to
handle all of our insurance policies and claims in one go.

The entire process starts when a prospect customer requests a quote for a new insurance. This could be an insurance for a house,
a car, health services or precious goods. Once a prospective customer has entered their personal data and the information required 
about the object they wish to insure, the data is bundled in a request-for-quote (RFQ) and sent to our sales department. An RFQ
must have the customer's first and last name, their phone number, home address, birthday and average monthly income. For the insured
object, the RFQ requires information about the type of object, whether it is a movable or non-movable good, the initial value,
current value and purchase date.

Once an RFQ is approved, a Quote is created for the customer. This quote includes all the information from the RFQ and adds the
applicable policies, suggested insured amount and an offer for the monthly cost of the insurance. A quote is valid for 30 days, 
after which either a customer accepts it and it turns into an insurance policy; or the customer has not accepted it and the 
process stops here.

When a Quote is accepted and turned into an Insurance Policy, the insurance policy is granted a starting date and references
the data from both the Customer and the Insured Object. An Insurance Policy also maintains the Customer's payment history, each 
entry of which contains the date of the bill and a date when it was payed (if at all).

On an active Insurance Policy, a Customer may file a Claim. A claim should always include the date of the incident, the nature
of the incident, details on any potentially involved third party as well as a description of the damage. A claim may then
be evaluated by one of our representatives. If a claim is awarded, it will result in a payout. If a claim is rejected, nothing else
happens until the customer files another claim.

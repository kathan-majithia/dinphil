<h1>Dinning Philosopher problem</h1>

<h3>Abstract</h3>
<div>It is a classic synchronization problem in the context of Operating Systems and concurrent programming.</div>
<div>It illustrates the challenge of resource sharing and deadlock prevention by giving rights to eat to only those who have the left and right fork, which are free.</div>
<h3>Overview</h3>
<div>The Java program gives a visual representation of the Dining Philosopher
Problem. In this problem, n number of philosophers are sitting at the round table.
Each Philosopher can either eat, think, or get hungry. By default, all philosophers
are thinking. If the philosopher wants to eat, then both left and right forks are
checked; if both are free, then only the  philosopher can eat; otherwise, they will be
hungry. </div>
<h3>Project Description</h3>
<div>The project consists of a class with a variable <b>n</b> and <b>state</b>.</div>
<div>n – Number of Philosophers to be taken from the user. 
</div>
<div>state – Status of the philosopher (Thinking, Hungry, or Eating) </div><br>
<div>By default, all philosophers will think.</div><br>
<div>There are two options: </div><br>
<h4>1) Check the status of the Philosopher: 
</h4>
<div>All philosophers will be displayed along with their status</div>
<h4>2) Change Status:</h4>
<div>If the philosopher is not eating, that means the philosopher wants to eat. To
do that, left and right philosophers should not be eating. If anyone is
eating, then the philosopher will be left hungry. If the condition is
correct, then the philosopher will start eating. 
</div>
<div>In case a philosopher is eating and wants to think, it will be changed
directly. But if left and right philosophers are hungry, then again
condition will be checked for an empty fork and based on the condition
2
They will be allowed to eat. 
</div>

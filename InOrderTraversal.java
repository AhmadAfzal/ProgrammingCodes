void InOrderTraversal(Node root)
	{
		if(root==null) return;
		
		InOrderTraversal(root.getLeft());
		System.out.println(root.value);
		InOrderTraversal(root.getRight());
		
	}
	
	void InOrderTraversal2(Node root)
	{
		if(root==null) return;
		
		Stack<Node> st=new Stack<Node>();
		
		Node n = root;
		
		while(n!=null)
		{
		st.push(n);
		n = n.getLeft();
		}
		
		
		while(st.size()>0)
		{
			Node m = st.pop(); 
			System.out.println(m);
			
			m=m.getRight();
			
		    while(m!=null)
			{
				st.push(m);
				m=m.getLeft();
			}
			
		}
		
		
		
	}
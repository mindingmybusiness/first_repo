package dev.autoboxing;

import java.util.ArrayList;

public class Bank {

	private String name;
	private ArrayList<Branch> branches;

	public Bank(String name) {
		this.name = name;
		this.branches = new ArrayList<Branch>();
	}

	public boolean addBranch(String branchName) {
		if (findBranch(branchName) == null) {
			this.branches.add(new Branch(branchName));
			return true;
		}
		return false;
	}

	public boolean addCustomer( String branchName, String cusomterName, double initialAmount) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			return branch.newCusomter(cusomterName, initialAmount);
		}
		return false;
	}

	private Branch findBranch(String branchName) {
		for (int i = 0; i < this.branches.size(); i++) {
			if (branches.get(i).getName().equals(branchName)) {
				return branches.get(i);
			}
		}
		return null;
	}

	public boolean addCustomerTransaction(String branchName, String cusomterName, double amount) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			return branch.addCustomerTransaction(cusomterName, amount);
		}
		return false;
	}

	public boolean listCustomers(String branchName, boolean showTransactions) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			System.out.println("Cusomters details for branch " + branch.getName());
			ArrayList<Customer> customers = branch.getCustomers();
			for (int i = 0; i <= customers.size()-1; i++) {
				Customer branchCustomer = customers.get(i);
				System.out.println("Customer name: " + branchCustomer.getName() + "[ " + (i + 1) + " ]");
				if (showTransactions) {
					System.out.println("Transactions ");
					ArrayList<Double> transactions = branchCustomer.getTransactions();
					for (int j = 0; j < transactions.size(); j++) {
						System.out.println("[ " + (j + 1) + " ] Amount " + transactions.get(j).doubleValue());
					}
				}
			}
			return true;
		} else {
			return false;
		}

	}

}

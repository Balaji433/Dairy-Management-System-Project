<jsp:include page="modules/header.jsp" />

<!-- Start::app-content -->
<div class="main-content app-content">
    <div class="container-fluid my-5">
        <!-- Start:: row-1 -->
        <div class="row">
            <div class="col-xl-12">
                <div class="card custom-card">
                    <div class="card-header justify-content-between">
                        <div class="card-title">Add DairyBankDetails</div>
                    </div>
                    <div class="card-body">
                        <form action="/addbank" method="post">
                            <div class="row">
                                <div class="col-xl-6">
                                    <div class="mb-3">
                                        <label for="iddairy_bank" class="form-label">Bank ID</label>
                                        <input type="text" class="form-control" id="iddairy_bank" name="iddairy_bank" placeholder="Enter Your Id">
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="mb-3">
                                        <label for="bank_name" class="form-label">Bank Name</label>
                                        <input type="text" class="form-control" id="bank_name" name="bank_name" placeholder="Enter Your bank_name">
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="mb-3">
                                        <label for="IFSC_code" class="form-label">IFSC Code</label>
                                        <input type="text" class="form-control" id="IFSC_code" name="IFSC_code" placeholder="Enter Your IFSC_code">
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="mb-3">
                                        <label for="branch_name" class="form-label">Branch Name</label>
                                        <input type="text" class="form-control" id="branch_name" name="branch_name" placeholder="Enter Your branch_name">
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="mb-3">
                                        <label for="account_number" class="form-label">Account Number</label>
                                        <input type="text" class="form-control" id="account_number" name="account_number" placeholder="Enter Your account_number">
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="mb-3">
                                        <label for="UPI_id" class="form-label">UPI ID</label>
                                        <input type="text" class="form-control" id="UPI_id" name="UPI_id" placeholder="Enter Your UPI_id">
                                    </div>
                                </div>
                                
                                <div class="col-xl-12">
                                    <button class="btn btn-primary" type="submit">Submit</button>
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="card-footer d-none border-top-0"></div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- End::app-content -->

<jsp:include page="modules/footer.jsp" />

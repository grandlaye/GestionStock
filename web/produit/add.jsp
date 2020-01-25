<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../header.jsp"></jsp:include>
<!-- Content Row -->

<div class="row">
    <!-- Area Chart -->
    <div class="col-xl-8 col-lg-7">
        <div class="card shadow mb-4">
            <!-- Card Header - Dropdown -->
            <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                <h6 class="m-0 font-weight-bold text-primary">Liste des produits</h6>
            </div>
            <!-- Card Body -->
            <div class="card-body">
                tableau
            </div>
        </div>
    </div>

    <!-- Pie Chart -->
    <div class="col-xl-4 col-lg-5">
        <div class="card shadow mb-4">
            <!-- Card Header - Dropdown -->
            <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                <h6 class="m-0 font-weight-bold text-primary">Ajouter Produit</h6>
            </div>
            <!-- Card Body -->
            <div class="card-body">
                <c:if test="${result == 1 }">
                    <div id="message" class="alert alert-success">Produit ajouter avec succes</div>
                </c:if>
                    <form method="post" action="Produit">
                    <div class="form-group">
                        <label>Nom du produit</label>
                        <input class="form-control" type="text" name="nom"/>
                    </div>
                    <div class="form-group">
                        <label>Quantite du produit</label>
                        <input class="form-control" type="text" name="qt"/>
                    </div>
                    <div>
                        <input class="btn btn-success" type="submit" name="envoyer"/>
                    </div>
                </form>

            </div>
        </div>
    </div>
</div>
<script>
    $(document).ready(function () {
        //alert(ok);
        $("#message").show().fadeOut(15000).css("color","green");
    });
</script>
<jsp:include page="../footer.jsp"></jsp:include>
@file:Suppress("TooManyFunctions", "InvalidPackageDeclaration")

package momosetkn.doma.migrate.querydsl

import org.seasar.doma.jdbc.BatchResult
import org.seasar.doma.jdbc.Result
import org.seasar.doma.jdbc.criteria.context.DeleteSettings
import org.seasar.doma.jdbc.criteria.context.InsertSettings
import org.seasar.doma.jdbc.criteria.context.UpdateSettings
import org.seasar.doma.jdbc.criteria.metamodel.EntityMetamodel
import org.seasar.doma.kotlin.jdbc.criteria.KQueryDsl
import org.seasar.doma.kotlin.jdbc.criteria.statement.KEntityqlBatchInsertStatement
import org.seasar.doma.kotlin.jdbc.criteria.statement.KEntityqlInsertStatement
import org.seasar.doma.kotlin.jdbc.criteria.statement.KStatement

// insert

@Deprecated(
    "Migrate to KQueryDsl method",
    replaceWith = ReplaceWith("this.insert(entityMetamodel).batch(entities)")
)
fun <ENTITY : Any> KQueryDsl.insert(
    entityMetamodel: EntityMetamodel<ENTITY>,
    entities: List<ENTITY>,
): KEntityqlBatchInsertStatement<ENTITY> {
    return this.insert(entityMetamodel).batch(entities)
}

@Deprecated(
    "Migrate to KQueryDsl method",
    replaceWith = ReplaceWith("this.insert(entityMetamodel, block).batch(entities)")
)
fun <ENTITY : Any> KQueryDsl.insert(
    entityMetamodel: EntityMetamodel<ENTITY>,
    entities: List<ENTITY>,
    block: InsertSettings.() -> Unit,
): KEntityqlBatchInsertStatement<ENTITY> {
    return this.insert(entityMetamodel, block).batch(entities)
}

@Deprecated(
    "Migrate to KQueryDsl method",
    replaceWith = ReplaceWith("this.insert(entityMetamodel).single(entity)")
)
fun <ENTITY : Any> KQueryDsl.insert(
    entityMetamodel: EntityMetamodel<ENTITY>,
    entity: ENTITY,
): KEntityqlInsertStatement<ENTITY> {
    return this.insert(entityMetamodel).single(entity)
}

@Deprecated(
    "Migrate to KQueryDsl method",
    replaceWith = ReplaceWith("this.insert(entityMetamodel, block).single(entity)")
)
fun <ENTITY : Any> KQueryDsl.insert(
    entityMetamodel: EntityMetamodel<ENTITY>,
    entity: ENTITY,
    block: InsertSettings.() -> Unit,
): KEntityqlInsertStatement<ENTITY> {
    return this.insert(entityMetamodel, block).single(entity)
}

// delete

@Deprecated(
    "Migrate to KQueryDsl method",
    replaceWith = ReplaceWith("this.delete(entityMetamodel).batch(entities)")
)
fun <ENTITY : Any> KQueryDsl.delete(
    entityMetamodel: EntityMetamodel<ENTITY>,
    entities: List<ENTITY>,
): KStatement<BatchResult<ENTITY>> {
    return this.delete(entityMetamodel).batch(entities)
}

@Deprecated(
    "Migrate to KQueryDsl method",
    replaceWith = ReplaceWith("this.delete(entityMetamodel, block).batch(entities)")
)
fun <ENTITY : Any> KQueryDsl.delete(
    entityMetamodel: EntityMetamodel<ENTITY>,
    entities: List<ENTITY>,
    block: DeleteSettings.() -> Unit,
): KStatement<BatchResult<ENTITY>> {
    return this.delete(entityMetamodel, block).batch(entities)
}

@Deprecated(
    "Migrate to KQueryDsl method",
    replaceWith = ReplaceWith("this.delete(entityMetamodel).single(entity)")
)
fun <ENTITY : Any> KQueryDsl.delete(
    entityMetamodel: EntityMetamodel<ENTITY>,
    entity: ENTITY,
): KStatement<Result<ENTITY>> {
    return this.delete(entityMetamodel).single(entity)
}

@Deprecated(
    "Migrate to KQueryDsl method",
    replaceWith = ReplaceWith("this.delete(entityMetamodel, block).single(entity)")
)
fun <ENTITY : Any> KQueryDsl.delete(
    entityMetamodel: EntityMetamodel<ENTITY>,
    entity: ENTITY,
    block: DeleteSettings.() -> Unit,
): KStatement<Result<ENTITY>> {
    return this.delete(entityMetamodel, block).single(entity)
}

// update

@Deprecated(
    "Migrate to KQueryDsl method",
    replaceWith = ReplaceWith("this.update(entityMetamodel).batch(entities)")
)
fun <ENTITY : Any> KQueryDsl.update(
    entityMetamodel: EntityMetamodel<ENTITY>,
    entities: List<ENTITY>,
): KStatement<BatchResult<ENTITY>> {
    return this.update(entityMetamodel).batch(entities)
}

@Deprecated(
    "Migrate to KQueryDsl method",
    replaceWith = ReplaceWith("this.update(entityMetamodel, block).batch(entities)")
)
fun <ENTITY : Any> KQueryDsl.update(
    entityMetamodel: EntityMetamodel<ENTITY>,
    entities: List<ENTITY>,
    block: UpdateSettings.() -> Unit,
): KStatement<BatchResult<ENTITY>> {
    return this.update(entityMetamodel, block).batch(entities)
}

@Deprecated(
    "Migrate to KQueryDsl method",
    replaceWith = ReplaceWith("this.update(entityMetamodel).single(entity)")
)
fun <ENTITY : Any> KQueryDsl.update(
    entityMetamodel: EntityMetamodel<ENTITY>,
    entity: ENTITY,
): KStatement<Result<ENTITY>> {
    return this.update(entityMetamodel).single(entity)
}

@Deprecated(
    "Migrate to KQueryDsl method",
    replaceWith = ReplaceWith("this.update(entityMetamodel, block).single(entity)")
)
fun <ENTITY : Any> KQueryDsl.update(
    entityMetamodel: EntityMetamodel<ENTITY>,
    entity: ENTITY,
    block: UpdateSettings.() -> Unit,
): KStatement<Result<ENTITY>> {
    return this.update(entityMetamodel, block).single(entity)
}
